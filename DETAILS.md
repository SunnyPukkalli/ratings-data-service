# Details for Current Branch

###### default profile
|Property                   |Values                         |
|---------------------------|-------------------------------|
|`server.port`              |`8082`                         |
|`zipkin.base-url`          |`http://localhost:9411/`       |
|`eureka url`               |`http://localhost:8095/eureka/`|

###### cloud profile
|Property                   |Values                         |
|---------------------------|-------------------------------|
|`server.port`              |`8080`                         |
|`zipkin.base-url`          |`http://zipkin-server/`        |
|`eureka url`               |`http://eureka-server/eureka/` |


## API Exposed for image version : e1
|API                        |Description                    |
|---------------------------|-------------------------------|
|**`/ratings/{movieId}`**       |will return Rating with movieId and Random.nextInt() as rating |
|**`/ratings/users/{userId}`**  |will return a randomly generated User Ratings List             |
