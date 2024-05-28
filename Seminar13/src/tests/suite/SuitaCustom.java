package tests.suite;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.PachetTuristicTest;
import tests.PersoanaTest;
import tests.suite.categorii.CuMock;
import tests.suite.categorii.FaraMock;

@RunWith(Categories.class)
@Suite.SuiteClasses({PersoanaTest.class, PachetTuristicTest.class})
@Categories.ExcludeCategory(CuMock.class)
@Categories.IncludeCategory(FaraMock.class)
public class SuitaCustom {
}
