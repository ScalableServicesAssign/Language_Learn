Once you clone this project
Before running the application create database with **languagelearningApp**

Create a table with ROLE
and run below query:
Create table Users_roles(
	role_id int;
	user_id int
);

Create table roles(
	id  int;
	user varchar(255)
);

insert into roles (id,name) values (1,'ADMIN');
insert into roles (id,name) values (2,'USER');

Run the Application using SpringBoot App
Go to post man App
Create a POST request as below:
url: http://localhost:8089/api/auth/register
body:
{
    "username":"sharu",
    "password":"sharu123"
}
hit the url: output: User Registered Successfully

Once you register:
Create a POST Request as below:
url: http://localhost:8089/api/auth/login
body:
{
    "username":"sharu",
    "password":"sharu123"
}
hit the url: output: 
{
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJzaGFydSIsImV4cCI6MTczMDQ5MzU4NX0.zCG8EiAdkojLfq6Jws2epZp9pU5Y_xrvdy4pn4ZIhnCTVQX-3JI0UeyOspyIlh0tpiGYQtsVqVJjnX5k_6Z4Cw",
    "tokenType": "Bearer "
}

