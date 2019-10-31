# Cucumber Basic Template

A basic gradle project for automatic testing with cucumber without any webdriver.

## [Build](BUILD.md)

Read the build file for the pre-requisites.

## Usage

1. **Clone** this repository on your local.

2. Remove the **.git folder** from where you cloned the repository.

3. Run the following command:

   ```
   gradlew test --info
   ```

   > If it completes successfully your setup is good.

# Sample Feature File

The sample **cucumber feature file** is called **is_it_friday_yet.feature** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\src\test\resources\gradle\cucumber
```

> The **LOCAL_CLONED_REPO_DIR** is where you cloned this repository.

# Sample Cucumber Runner File

The sample **cucumber runner file** is called **CucumberRunner.java** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\src\test\java\gradle\cucumber
```

> The **LOCAL_CLONED_REPO_DIR** is where you cloned this repository.

# Sample Step Definition

The sample **step definition file** is called **IsItFridayYetStepdefs.java** and is located in the following directory:

```
<LOCAL_CLONED_REPO_DIR>\src\test\java\gradle\cucumber
```

> The **LOCAL_CLONED_REPO_DIR** is where you cloned this repository.

## Author

* Ronaldo Webb
