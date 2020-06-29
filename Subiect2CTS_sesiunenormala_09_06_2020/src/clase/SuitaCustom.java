package clase;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import teste.categorii.CategorieTesteVarsta;
import teste.testCalculValoareTVA;
import teste.testeSetPret;

@RunWith(Categories.class)
@SuiteClasses({testCalculValoareTVA.class,testeSetPret.class})
@IncludeCategory({CategorieTesteVarsta.class})
public class SuitaCustom {

}
