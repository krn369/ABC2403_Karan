package bottle;

 class bottle {

	  """A class representing a bottle that keeps track of the type and amount of liquid added during multiple refills."""

	  private final int capacity;
	  private final List<Refill> refills;

	  public Bottle(int capacity) {
	    this.capacity = capacity;
	    this.refills = new ArrayList<>();
	  }

	  public void refill(String liquidType, double amount) throws IllegalArgumentException {
	    if (amount > remainingCapacity()) {
	      throw new IllegalArgumentException("Refill amount exceeds remaining capacity");
	    }
	    refills.add(new Refill(liquidType, amount));
	  }

	  public double remainingCapacity() {
	    return capacity - totalLiquidAdded();
	  }

	  private double totalLiquidAdded() {
	    return refills.stream().mapToDouble(Refill::getAmount).sum();
	  }

	  public List<String> getLiquidTypes() {
	    return refills.stream().map(Refill::getLiquidType).distinct().toList();
	  }

	  public Map<String, Double> getTotalLiquidByType() {
	    return refills.stream()
	        .collect(Collectors.groupingBy(Refill::getLiquidType, Collectors.summingDouble(Refill::getAmount)));
	  }

	  // Refill class to store information about each refill
	  private static class Refill {
	    private final String liquidType;
	    private final double amount;

	    public Refill(String liquidType, double amount) {
	      this.liquidType = liquidType;
	      this.amount = amount;
	    }

	    public String getLiquidType() {
	      return liquidType;
	    }

	    public double getAmount() {
	      return amount;
	    }
	  }
}
