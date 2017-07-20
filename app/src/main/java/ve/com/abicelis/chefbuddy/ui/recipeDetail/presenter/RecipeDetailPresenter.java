package ve.com.abicelis.chefbuddy.ui.recipeDetail.presenter;

import ve.com.abicelis.chefbuddy.model.Recipe;
import ve.com.abicelis.chefbuddy.ui.recipeDetail.view.RecipeDetailView;

/**
 * Created by abicelis on 14/7/2017.
 */

public interface RecipeDetailPresenter {
    void attachView(RecipeDetailView view);
    void detachView();

    void setRecipeId(long recipeId);
    void reloadRecipe();
    void deleteRecipe();
    Recipe getLoadedRecipe();

}
