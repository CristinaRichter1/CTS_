package cts.as.richter.cristina.testeUnitare;

import org.junit.experimental.categories.Categories;
//import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import cts.as.richter.cristina.interfete.ITesteUnitarePret;

@RunWith(Categories.class)
@SuiteClasses({ TestConstructorAvion.class, TestGetPretBilet.class, TestSetGreutateIncarcata.class })
@IncludeCategory({ITesteUnitarePret.class})
//@ExcludeCategory({ITesteUnitarePret.class})
public class SuitaCustom {

}
