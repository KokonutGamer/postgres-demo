# Getting started
## Setting up the Database
This application connects to a PostgreSQL Database running on port `5432` with the name `demo`.

> [!WARNING]
> If you happen to have a database named `demo`, either edit this project's `.sql` files
> to ensure you're not going to be losing data, or rename your database to a different name.

Within the `application.properties` file under `src/main/resources/`, modify the following properties:
- `spring.datasource.username`: specify a user that exists within your local PostgreSQL instance
- `spring.datasource.password`: specify the password for the user above.

> [!NOTE]
> See [__Creating a PostgreSQL User and Password__](#creating-a-postgresql-user-and-password) for information on creating a user


### Creating a PostgreSQL User and Password
1. Connect to PostgreSQL as another user (if no other users exist, use the default `postgres` user)
2. Run the command, `CREATE USER <username> PASSWORD <password>` (see [the official PostgreSQL docs][psql-up] for more information on creating users)

[psql-up]: https://www.postgresql.org/docs/8.0/sql-createuser.html