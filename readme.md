# CP-SAT Exam - Boilerplate Project (InteliJ) :rocket:

> A Kickstarter project for candidates appearing for CP-SAT exam.

> Please note that this project is created to be used in Intelij IDEA. For Eclipse boilerplate, please
> check <a href="https://github.com/cpsatcontent/cp-sat-boilerplate-eclipse" target="_blank">here.</a>

## ⛏️ Built with

<a href="https://www.java.com" target="_blank"> <img src="https://raw.githubusercontent.com/devicons/devicon/master/icons/java/java-original.svg" alt="java" width="50" height="80"> </a>
&nbsp;&nbsp;&nbsp;
<a href="https://www.selenium.dev" target="_blank"> <img src="https://upload.wikimedia.org/wikipedia/commons/9/9f/Selenium_logo.svg" alt="selenium" width="180" height="80"> </a>

## Table of Contents

- [Getting Started](#small_airplane-getting-started)
    - [Pre-requisite](#desktop_computer-prerequisite)
    - [Validate Installations](#shield-validate-installations)
- [Forking the Repository](#hammer_and_wrench-forking-the-repository)
- [Validating the Fork](#validating-the-fork)
- [Run Boilerplate Tests](#arrow_forward-run-boilerplate-tests)
- [Project Dependencies](#dependabot-project-dependencies)

## :small_airplane: Getting Started

### :desktop_computer: Prerequisite

Before running this project, please make sure that following libraries are installed in your machine.

- [Java JDK 16 or higher](https://www.oracle.com/in/java/technologies/downloads/)
- [Node-Js LTS](https://nodejs.org/en)
- Git ([Windows](https://gitforwindows.org/) / [Mac](https://git-scm.com/download/mac))
- Download Maven from [here](https://maven.apache.org/download.cgi) & set `MAVEN_HOME` as environment variable by
  following [this](https://www.qamadness.com/knowledge-base/how-to-install-maven-and-configure-environment-variables/)
  guide

### :shield: Validate Installations

To check whether all prerequisites have been correctly installed, run the following instructions and see if you get the
expected results.

```bash
java --version
```

```bash
node --version
npm --version
```

```bash
git --version
```

```bash
mvn --version
```

:memo: Please keep in mind that the version number in the output of the above commands may differ from what is shown in
the screenshot, and it should represent the version number of the libraries that you have installed.

## :hammer_and_wrench: Forking the Repository

### Step-by-Step Guide to Fork the Repo

1. **Navigate to the Repository**
    - Go to the GitHub repository you want to fork. For example, visit
    - Repository Link: IntelliJ IDEA Project
      > [https://github.com/cpsatcontent/cp-sat-boilerplate-intelij/](https://github.com/cpsatcontent/cp-sat-boilerplate-intelij/)
    - Repository Link: Eclipse Project
      > [https://github.com/cpsatcontent/cp-sat-boilerplate-eclipse/](https://github.com/cpsatcontent/cp-sat-boilerplate-eclipse)
2. **Click on the Fork Button**
    - In the top-right corner of the repository page, click the `Fork` button.
      > ![Step 2 - Click on the Fork Button](https://i.ibb.co/X557D94/intelij-repo-fork.png)

3. **Select Your Account**
    - Choose your GitHub account or an organization where you want to fork the repository.
    - ![Step 3 - Select Your Account](path/to/screenshot3.png)

4. **Wait for the Forking Process**
    - GitHub will create a copy of the repository under your account. This may take a few seconds.
    - ![Step 4 - Wait for the Forking Process](path/to/screenshot4.png)

## Validating the Fork

### How to Validate the Repo is Forked Under Your Username

1. **Check the Repository URL**
    - After forking, ensure you are redirected to your forked repository. The URL should be
      > `https://github.com/[your-username]**/cp-sat-boilerplate-intelij`

      > `https://github.com/**[your-username]**/cp-sat-boilerplate-eclipse`

      > ![Step 1 - Check the Repository URL](path/to/screenshot5.png)

2. **Verify the Repository Details**
    - Look at the top-left corner of the repository page. You should see `your-username/cp-sat-boilerplate-intelij`
      or `your-username/cp-sat-boilerplate-eclipse`.
      > ![Step 2 - Verify the Repository Details](path/to/screenshot6.png)

3. **Check the Fork Badge**
    - There should be a `Forked from original-username/repository-name` badge under the repository name.
    - ![Step 3 - Check the Fork Badge](path/to/screenshot7.png)

If all the above steps are confirmed, you have successfully forked the repository under your username.

## :arrow_forward: Run Boilerplate Tests

- Open `cmd` or `terminal` based on your machine and run following command
    
  ```bash
      mvn clean test
    ``` 
   > _If everything is set up correctly, you should see a browser being launched and a login scenario running
   on [The Internet](https://the-internet.herokuapp.com/) website._

3. To start writing the code, open the project in InteliJ IDE. _(
   i.e. [IntelliJ IDEA](https://www.jetbrains.com/idea/download/))_

## :dependabot: Project Dependencies

This project utilizes several dependencies to provide various functionalities. Below is a table listing each dependency,
its version, and a URL to its repository for more information.

| Dependency Name     | Version   | URL                                                                                                |
|---------------------|-----------|----------------------------------------------------------------------------------------------------|
| selenium-java       | 4.21.0    | [selenium-java](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java)          |
| webdrivermanager    | 5.8.0     | [webdrivermanager](https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager)       |
| testng              | 7.10.2    | [testng](https://mvnrepository.com/artifact/org.testng/testng)                                     |
| junit-jupiter-api   | 5.11.0-M2 | [junit-jupiter-api](https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api)        |
| javafaker           | 1.0.2     | [javafaker](https://mvnrepository.com/artifact/com.github.javafaker/javafaker)                     |
| poi                 | 5.2.5     | [poi](https://mvnrepository.com/artifact/org.apache.poi/poi)                                       |
| poi-ooxml           | 5.2.5     | [poi-ooxml](https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml)                           |
| poi-ooxml-schemas   | 4.1.2     | [poi-ooxml-schemas](https://mvnrepository.com/artifact/org.apache.poi/poi-ooxml-schemas)           |
| assertj-core        | 3.26.0    | [assertj-core](https://mvnrepository.com/artifact/org.assertj/assertj-core)                        |
| assertj-guava       | 3.26.0    | [assertj-guava](https://mvnrepository.com/artifact/org.assertj/assertj-guava)                      |
| commons-io          | 2.16.1    | [commons-io](https://mvnrepository.com/artifact/commons-io/commons-io)                             |
| commons-lang3       | 3.14.0    | [commons-lang3](https://mvnrepository.com/artifact/org.apache.commons/commons-lang3)               |
| commons-beanutils   | 1.9.4     | [commons-beanutils](https://mvnrepository.com/artifact/commons-beanutils/commons-beanutils)        |
| selenium-shutterbug | 1.6       | [selenium-shutterbug](https://mvnrepository.com/artifact/com.assertthat/selenium-shutterbug)       |
| log4j-core          | 2.23.1    | [log4j-core](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-core)               |
| log4j-api           | 2.23.1    | [log4j-api](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-api)                 |
| log4j-slf4j2-impl   | 2.23.1    | [log4j-slf4j2-impl](https://mvnrepository.com/artifact/org.apache.logging.log4j/log4j-slf4j2-impl) |

Each dependency listed here is vital for the functionality and performance of this project. For more detailed
information, visit the URLs provided.


> [!TIP]
> Please note that these are the minimum dependencies bundled as a part of this project. Feel free to add/update the
version of above dependencies or add new dependencies/libraries of your choice.

## :magic_wand: Brought to you by

<a href="https://cpsat.agiletestingalliance.org/" target="_blank"><img src="https://cpsat.agiletestingalliance.org/wp-content/uploads/2019/06/abt-logo-unsmushed.png" width="100" height="100"></a>
&nbsp;
<a href="https://www.agiletestingalliance.org/" target="_blank"><img src="https://www.agiletestingalliance.org/wp-content/uploads/2021/02/ATA-logo.png" width="110" height="110"></a>
