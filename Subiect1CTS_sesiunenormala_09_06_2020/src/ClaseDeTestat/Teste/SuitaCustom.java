package ClaseDeTestat.Teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import ClaseDeTestat.Teste.Categorii.CategorieTesteVarsta;

@RunWith(Categories.class)
@SuiteClasses({testCalculValoareTVA.class,testSetter.class})
@IncludeCategory({CategorieTesteVarsta.class})
public class SuitaCustom {

}
