# JUnit
Repositories Cover usage of JUnit

## JUnit Basic Annotations
1. @Test
2. @Before
3. @After
4. @BeforeClass
5. @AfterClass
6. @Ignore
7. @Test(expected = Exception.class)
8. @Test(timeout = 100)

The assert methods are under namespace org.junit.Assert package.

assertEquals("expected", "actual") will be used to check the equality of the the result

assertEquals also privode an overloaded method which provides optional messsage in case of failue
assertEquals("message", "expected", "actual")

@Ignore will ignore the tests marked with the attribute.

@BeforeClass 
Executes before once for the test class

@AfterClass
Executes once after the tests are run for the class

@Test(timeout=100)
number of milliseconds the test wait for the method to be executed and report failure if the test is not completed in the timeframe.

## Assertions

1. assertArrayEquals
2. assertEquals
3. assertTrue
4. assertFalse
5. assertNull
6. assertNotNull
7. assertSame
8. assertNotSame
9. fail
10. assertThat

## Test Suites

Allows to run multiple test classes without selecting each.

Create a TestSuiteClass and annotate with @RunWith annotation and tell it to use @Suite.SuiteClasses(...)

## Category

Categories are used to categorize tests and are run as a part of test run
Create a category interface which is a marker interface and decorate methods with @Category with name as the category marker interface.

1. Create a new test suite class
2. Decorate the suite class with @RunWith(Categories.class)
3. Decorate the class with @IncludeCategory to include the tests under category 
4. Decorate the class with @Suite.SuiteClasses({class1.class,class2.class})

Run the suite class to run test cases that are part of category

## assertThat

Contains advanced matcher statements
1. is
2. hasItem
3. containsString
4. IsNull
5. allOf
6. anyOf
7. isAnything
8. isNot
9. isSame

## Rules

1. ExpectedException
2. TemporaryFolder
3. ExternalResource
4. ErrorCollector
5. Verifier
6. TestWatcher
7. TestName
8. Timeout
9. RuleChain




...
