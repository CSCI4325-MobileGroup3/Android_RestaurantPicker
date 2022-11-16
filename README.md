# Milestone 1 - Restaurant Picker

## Table of Contents

1. [Overview](#Overview)
2. [Product Spec](#Product-Spec)
3. [Wireframes](#Wireframes)
4. [Sprint 1 Progress](#Sprint-1-11/1)
5. [Sprint 2 Progress](#Sprint-2-11/8)
6. [Sprint 3 Progress](#Sprint-3-11/15)
7. [Demo Presentation](https://youtu.be/Tvfo39YfgsM)

## Overview

### Description

Create lists of restaurants, and then randomly pick a restaurant on that list. Pull up information and directions on restaurant. Or randomly pick a restaurant in the area.

### App Evaluation

- **Category:** Lifestyle & Travel
- **Mobile:** This app is primarily mobile because it is to be used on the go while visiting new areas in your vicinity. It will use your location and maps to find local restaurants.
- **Story:** The audience for this app idea is marketed towards undecisive people who are not sure which restaurant to choose.
- **Market:** The user base could potentially be large or small. The audience is for people who can't decide what restaurant to try.
- **Habit:** This app can be used frequently depending on how much the users hit this barrier of not knowing what restaurant to attend.
- **Scope:** This might be a challenge to build this app because you need to first gather the local restaurants through an api possibly. A stripped down version might be possible by entering the restaurants manually. It is a clearly defined product.

## Product Spec

### 1. User Features (Required and Optional)

**Required Features**

* Make list of nearby restaurants
* Randomly pick one out of that list
* Save the lists so they can be reused between sessions


**Stretch Features**

* Edit an already existing list
* Use user location to be able to find nearby restaurants in the area
* Restaurant description and contact information
* Opens Google Maps for directions to that restaurant
* Button to add restaurant to a list from the map
* History or restaurants you recently viewed in the app
* History of recently edited lists

### 2. Screen Archetypes

* Stream
  - User can view a list of nearby/recently vistited restaurants
  - User can view a list of recently edited lists
  - User can randomly pick a restaurant from their lists
* Details
  - User can view the restaurants contained in their lists
* Creation
  - User can create/edit lists
  - User can add/remove restaurants from their lists
* Maps
  - Show User's location and nearby restaurants on a map
  - User can view details on restaurants such as description and contact information
  - Users can add restaurants to their lists
  - Opens Google Maps to give User directions to restaurants

### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Lists
* Home
* Maps
* Settings

**Flow Navigation** (Screen to Screen)

* Home
  - => Edit List Screen
  - => Map Screen with Restaurant Details ( Recently Visited or Random )
* Lists
  - => Edit List Screen
  - => Map Screen with Randomly Selected Restaurant
* Edit List Screen
  - => Lists Screen After Hitting Done
* Map
  - => None from this app
  - => Google Maps for directions
* Settings
  - => None

## Wireframes

Hand Drawn WireFrame:

<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/RestaurantPicker_Wireframe.jpg" width=600>

### [BONUS] Digital Wireframes & Mockups

* Home Screen
<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/FigmaWireframe/HomeScreen.png">

* List Screen
<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/FigmaWireframe/ListView.png">

* Edit List Screen
<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/FigmaWireframe/EditList.png">

* Map Screen
<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/FigmaWireframe/Map.png">

* Settings Screen
<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/FigmaWireframe/Settings.png">

### [BONUS] Interactive Prototype

<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/proto.gif">

## Sprint 1 11/1

### User Stories

- [x] As a Dev, I would like to Initialize Github Project in repository
- [x] As a Dev, I would like to Research Google Maps API
- [x] As a User, I would like to have a bottom navigation bar
- [x] As a User, I would like a Home Screen View
- [x] As a User, I would like a List Screen View
- [ ] As a User, I would like a Map Screen View
- [ ] As a User, I would like a Settings Screen View
- [x] As a User, I would like a Edit List Screen View

### Build Preview

<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/Sprint1.gif">

## Sprint 2 11/8

### User Stories

- [x] As a User, I would like a place to manage my Settings
- [ ] As a User, I should be able to create a list of restaurants
- [ ] As a User, I should be able to edit an already existing list of restaurants
- [ ] As a User, I should be able to get a random restaurant selected from their list
- [ ] As a User, I should be able to open Google Maps to get directions to the selected restaurant

### Build Preview

<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/Sprint2.gif">

<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/Sprint2_AddToList.gif">

## Sprint 3 11/15

### User Stories

- [x] As a User, I should be able to create a list of restaurants
- [ ] As a User, I should be able to edit an already existing list of restaurants
- [x] As a User, I should be able to get a random restaurant selected from their list
- [x] As a User, I would like my created lists to be saved between sessions

### Build Preview
<img src="https://github.com/CSCI4325-MobileGroup3/Android_RestaurantPicker/blob/main/Documentation/showing%20saved%20data.gif">

## Final Demo Presentation

[Video Link](https://youtu.be/Tvfo39YfgsM)
