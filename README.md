# Space Mission Resource Manager

A Java-based system for optimizing satellite resources, designed for aerospace applications. This project demonstrates problem-solving with data structures and algorithms, inspired by LeetCode, and integrates Physics 1 principles (e.g., Δv for orbital maneuvers). Built to prepare for technical interviews at aerospace and tech companies like SpaceX and Tesla.

## Fuel Optimizer Module

The **Fuel Optimizer** finds all pairs of fuel tanks whose amounts sum to a target value for satellite maneuvers. Using Java's `HashMap` and `ArrayList`, it implements an efficient O(n) "Two Sum" algorithm, handling duplicates and edge cases.

### Features
- **Input**: Array of fuel amounts (`int[]`) and target fuel (`int`).
- **Output**: List of index pairs (`List<int[]>`), e.g., `[10, 15, 25, 30]` with target `40` returns `[[0, 3], [1, 2]]`.
- **Physics Integration**: Supports Δv calculations for burns (Physics 1: Δv = v_e * ln(m_initial / m_final)).
- **Applications**: Optimizes fuel allocation for satellite orbit adjustments or similar resource problems (e.g., Tesla battery cell pairing).

### Example
```java
FuelOptimizer optimizer = new FuelOptimizer();
int[] fuelTanks = {10, 10, 10};
int target = 20;
List<int[]> pairs = optimizer.findFuelPairs(fuelTanks, target);
// Output: [[0, 1], [0, 2], [1, 2]]
