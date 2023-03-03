# InterviewTask
Here i used testng concept,
Steps to download testngn eclipse:
1)open eclipse
2)go to help
3)select eclipse market place
4)search for testng
5)ok
6)install
7)ok
8)ok

In order to verify the TestNg istallation->
Go to windows->show view->others->expand java folder,TestNG symbol will be present

Steps to attach testng to project:
create maven project,go to pom.xml,
inside the pom.xml,insert<dependencies> tag
go to global repository[http://mvnrepository.com]
searh for required tool like testng
copy the dependencycode and paste the dependency code to Pom.xml
save the file[Pom.xml file automatically connect to global Repo via internet and download all the jars in to .m2[maven-local Repo]folder then attach the jar to the project.


Steps to develop testng class:
Created one project,calledInterviewTask,
create a package inside src/test folder(Task)
inside a package create two clasees(RecentList and SongArrange)[here using inheritance concept i.e,songArrange cls extends the RecentList class]

here we have to execute main class i.e,SongArrange
To convert to testng.xml file ,right click on classs->testng->convert to testng->finish

when we run the progrm,on console ,it asks for arraysize,we can mention
later we can mention songs which we played,for ex:s1,s2,s3
we cn play the song which we want to play.this is how it works...

To push the code to github:
first we have to create github account
later we have to create repository:
1)login to github
2)go to + dropdown menu and click on new repository
3)give repository namewith readme 
4)click on create repository


To share Existing framework in eclipse to git:
1)select the project(InterviewTask)->right click->team->share project
2)Status of the project should be [NO-HEAD]

Totransfer the framework from working directory to localrepository:
1)Selectthe project->team->click on commit
2)go to git staging window,drag all files from unstaged area to stage area
3)write commit message and click on commit

Transfer the framework from lacal repository to global repository:
1)Select project->team->click on push brach master
2)provide url,username and password ad follow the procedure

