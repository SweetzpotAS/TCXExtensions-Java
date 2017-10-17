## TCXExtensions

TCXExtension is a library to include additional information about Rowing and Breathing into TCX files. It is designed to work with [TCXZpot](https://github.com/SweetzpotAS/TCXZpot-Java).

### Usage

TCX allows extensions in different nodes in the XML tree. Our extensions are designed to be included into `Trackpoint` nodes and `Activity`nodes, and they can hold information about Rowing or Breathing.

#### Trackpoint Extensions

In **TCXZpot** you can create a `Trackpoint` with the following code:

```java
aTrackpoint()
    .onTime(tcxDate(10, FEBRUARY, 2017, 10, 43, 20))
    .withPosition(position(-3.6733, 36.901))
    .build();
```

This builder has a method `withExtensions()` that accepts a variable number of instances implementing `TCXExtension`. With this library, you can create the following extensions:

- **Rowing**:

```java
rowing().withAcceleration(acceleration(1.0, 2.1, 3.2))
        .withSpeed(metersPerSecond(27.3))
        .withStrokeRate(strokeRate(46))
        .withRawForce(rawForce(1958))
        .build();
```

- **Breathing**:

```java
breathing().withRawBreathing(rawBreathing(391))
           .build();
```

To include them into a `Trackpoint`:

```java
aTrackpoint()
    .onTime(tcxDate(10, FEBRUARY, 2017, 10, 43, 20))
    .withPosition(position(-3.6733, 36.901))
    .withExtensions(rowing().withAcceleration(acceleration(1.0, 2.1, 3.2))
                            .withSpeed(metersPerSecond(27.3))
                            .withStrokeRate(strokeRate(46))
                            .withRawForce(rawForce(1958))
                            .build(),
                    breathing().withRawBreathing(rawBreathing(391))
                               .build())
    .build();
```

#### Activity Extensions

In **TCXZpot** you can create an `Activity` with the following code:

```java
activity(RUNNING)
    .withID(tcxDate(10, FEBRUARY, 2017, 10, 42, 0))
    ...
    .build()
``` 

This builder has a method `withExtensions()` that accepts a variable number of instances implementing `TCXExtension` With this library, you can create the following extensions:

- **Rowing**:

```java
rowing().withAverageHeartRate(bpm(82))
        .withAverageSpeed(metersPerSecond(27.3))
        .withAverageStrokeRate(strokeRate(46))
        .build();
```

To include it into an Activity:

```java
activity(RUNNING)
    .withID(tcxDate(10, FEBRUARY, 2017, 10, 42, 0))
    .withExtensions(rowing().withAverageHeartRate(bpm(82))
                            .withAverageSpeed(metersPerSecond(27.3))
                            .withAverageStrokeRate(strokeRate(46))
                            .build())
    ...
    .build()
``` 

### Download

You can get TCXExtensions from **JCenter** adding this to your Gradle build file:

```groovy
compile 'com.sweetzpot.tcxextensions:lib:1.0.0'
```

### License

    Copyright 2017 SweetZpot AS

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.