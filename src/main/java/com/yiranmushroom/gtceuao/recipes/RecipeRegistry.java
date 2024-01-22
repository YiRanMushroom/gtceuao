package com.yiranmushroom.gtceuao.recipes;

import com.yiranmushroom.gtceuao.recipes.machine.AERecipes;
import com.yiranmushroom.gtceuao.recipes.machine.CircuitRecipes;
import com.yiranmushroom.gtceuao.recipes.machine.EasyChemistryRecipes;
import net.minecraft.data.recipes.FinishedRecipe;

import java.util.function.Consumer;

public class RecipeRegistry {
    public static void registerRecipes(Consumer<FinishedRecipe> provider) {
        CircuitRecipes.register(provider);
        AERecipes.register(provider);
        EasyChemistryRecipes.register(provider);
    }
}
