## Design Rational
1. Use Enum to define the vote permission  
Using Enum to represent a pre-defined limited number of set is clear and 
easier to maintain the code. The alternative is to use hard-coded string or integer 
to represent different permission.

2. Provide single and bulk operation on organizer to make it symmetric
According to API design principle, users expected privided API to be symmetric, if
they see add and addAll, they will intuitively expect using removeAll

3. Return the remaining number of vote after a voter finish voting
Provide convenience for voters to not making another call to get remaining number of 
vote. It also reduces the possibility that voters make invalid call of vote() because
number of vote exceed granted number. 
