# Milestone 1 - Restaurant Picker

## Table of Contents

1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)

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
* Opens Google Maps for directions to that restaurant
* Use user location to be able to find nearby restaurants in the area
* Restaurant description and contact information

**Stretch Features**

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

### [BONUS] Interactive Prototype
