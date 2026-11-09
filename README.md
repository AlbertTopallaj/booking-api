# Booking-API

## How to start the project

1. Clone the git repository using the following command in the terminal:

`git clone https://github.com/AlbertTopallaj/booking-api`

2. Start the project using the follow command in the terminal:

`docker compose up`

## What env vars are needed

The needed env vars are shown in `.env.example` file

## How the database starts

The database which is a **_PostgreSQL_** database, starts automatically when starting the project

## How three instances starts

The three instances are configured in the `docker-compose.yml` file, when starting the project the three different instances becomes three containers.

## What adress to reach the API?

The API can be reached through the following adress

`http://localhost:80`

## How GET /instance is used to test load balancing

When using the `GET /INSTANCE` endpoint, the output is which of the three instances are used, every new request shows a different instance. Which means that the load balancing is working and the three instances are in use.

## How one instance can go down to test that the API still works

When one instance goes down, the API still works because of the method Round Robin which means that if one instance goes down the requests goes to the other instances that are still online
