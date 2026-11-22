# Booking-API

## How to start the project

1. Clone the git repository using the following command in the terminal:

`git clone https://github.com/AlbertTopallaj/booking-api`

2. Create a `.env file` using the following command:

`cp .env.example .env`

3. Start the project using the follow command in the terminal:

`docker compose up`

## What env vars are needed

The needed env vars are shown in `.env.example` file

- `DATABASE_NAME` - the name of the database
- `DATABASE_USER` - the database user
- `DATABASE_PASSWORD` - the database password

## How the database starts

The database which is a **_PostgreSQL_** database, starts automatically when starting the project.

There are `3` api instances of the api, they use the same database. 

## How three instances starts

The three instances are configured in the `docker-compose.yml` file, when starting the project the three different instances becomes three containers.

## What adress to reach the API?

The API can be reached through the following adress

`http://localhost:80`

> **_NOTE:_** Every request goes through Nginx

The following endpoints are available on `booking-api`:

- GET /bookings/get - Get all bookings
- POST /bookings/create-booking - Create Booking
- PATCH /bookings/change-status/{bookingId} - Change the status of a booking
- PATCH /bookings/update/{bookingId} - Change information about a booking
- DELETE /bookings/delete/{bookingId} - Delete a booking
- GET /bookings/get/{bookingId} - Get a specific booking

## How GET /instance is used to test load balancing

When using the `GET /instance` endpoint, the output is which of the three instances are used, every new request shows a different instance. Which means that the load balancing is working and the three instances are in use.

## How one instance can go down to test that the API still works?

When one instance goes down, the API still works because of the method Round Robin which means that if one instance goes down the requests goes to the other instances that are still online.

To test this:

1. Stop one instance:  `docker compose stop api2`
2. Test the `GET /instance`, now only api1 and api3 answer. 
3. Test the `GET /bookings/get`, the same bookings are still there since the instances are using the same database.
4. Start the instance again: `docker compose start api2`

## How should I test this `booking-api`?

You can test the `booking-api` through any preferable API-tester for example `POSTMAN` 