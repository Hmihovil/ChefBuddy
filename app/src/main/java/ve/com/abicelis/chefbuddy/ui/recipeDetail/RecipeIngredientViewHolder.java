package ve.com.abicelis.chefbuddy.ui.recipeDetail;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import ve.com.abicelis.chefbuddy.R;
import ve.com.abicelis.chefbuddy.model.Measurement;
import ve.com.abicelis.chefbuddy.model.RecipeIngredient;

/**
 * Created by abicelis on 15/7/2017.
 */

public class RecipeIngredientViewHolder extends RecyclerView.ViewHolder {

    //DATA
    private RecipeIngredientAdapter mAdapter;
    private Activity mActivity;
    private RecipeIngredient mCurrent;
    private int mPosition;

    //UI
    @BindView(R.id.list_item_recipe_ingredient_amount_measurement)
    TextView mAmountMeasurement;

    @BindView(R.id.list_item_recipe_ingredient_name)
    TextView mName;

    @BindView(R.id.list_item_recipe_ingredient_icon_image)
    ImageView mIconImage;


    public RecipeIngredientViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void setData(RecipeIngredientAdapter adapter, Activity activity, RecipeIngredient current, int position) {
        mAdapter = adapter;
        mActivity = activity;
        mCurrent = current;
        mPosition = position;

        mName.setText(mCurrent.getIngredient().getName());

        mAmountMeasurement.setVisibility(View.VISIBLE);
        if (Measurement.NONE.equals(mCurrent.getMeasurement())) {
            if (mCurrent.getAmount().isEmpty())
                mAmountMeasurement.setVisibility(View.GONE);
            else
                mAmountMeasurement.setText(mCurrent.getAmount());
        } else {
            mAmountMeasurement.setText(mCurrent.getAmount() + " " + mCurrent.getMeasurement().getAbbreviation());
        }

        mIconImage.setImageResource(mCurrent.getMeasurement().getIconRes());
    }

    public void setListeners() {
        /* No listeners */
    }

}
