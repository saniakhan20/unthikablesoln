# Last Mile Delivery Tracker

## Overview

I was able to complete the **Volumetric Weight and Billable Weight Calculation** module, which forms part of the delivery charge calculation process.

## Implemented Feature

### Volumetric Weight Calculation

The backend exposes an API that:

- Accepts package dimensions (Length, Breadth, Height)
- Accepts the actual package weight
- Calculates volumetric weight using the formula:

```
Volumetric Weight = (Length × Breadth × Height) / 5000
```

- Determines the billable weight by selecting the greater of:
  - Actual Weight
  - Volumetric Weight

### API Endpoint

**POST** `/orders/calculate`

#### Sample Request

```json
{
  "length": 30,
  "breadth": 20,
  "height": 25,
  "actualWeight": 2.5
}
```

#### Sample Response

```json
{
  "volumetricWeight": 3.0,
  "billableWeight": 3.0
}
```

---

## Tech Stack

- Java
- Spring Boot
- Maven

---

## How to Run

1. Clone the repository.
2. Open the project in your preferred IDE.
3. Run the Spring Boot application.
4. Access the API at:

```
http://localhost:8080/orders/calculate
```

---

## Note

This repository contains only a partial implementation completed within the available time. The implemented module demonstrates the core logic for volumetric and billable weight calculation, which serves as one component of the overall delivery pricing workflow.
