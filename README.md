Problem Statement:
Given a list of orders with the order number, weight, city, and pin code.
Please write a loop to generate about 1000 orders split into 5 cities each with 2 pin codes
under it. After generating data, arrange them into a bunch of containers for efficient delivery.
And display the list of containers with the container's city and pincode (if applicable). Each
container can only take 1000 kg. All orders for one pincode should go in the same container.
But if there are more than containers for the same city, with less than 1000 kg, then merge
them, but without partial merging. For example container 1 - 500 kg, container 2 - 600 kg,
container 3 - 400 kg. In this case, containers 1 and 2 cannot be merged as it will lead to a
partial merge.
Hint - reduction of one array into smaller array, and probably additional reduction at the end
it
