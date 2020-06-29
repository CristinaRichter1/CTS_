package cts.as.richter.cristina.testeUnitare;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import cts.as.richter.cristina.testeUnitare.categorii.CategoriePret;

@RunWith(Categories.class)
@SuiteClasses({ TestAvion.class, TestGetPretBilet.class, TestSetGreutateIncarcata.class })
@IncludeCategory({CategoriePret.class})
public class SuitaCustom {

}
