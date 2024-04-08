class CountStudents {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int circleCount = 0;
        int squareCount = 0;

        for(int stud : students) {
            if(stud == 0) {
                circleCount++;
            }
            else {
                squareCount++;
            }
        }

        for(int sandwich : sandwiches) {

            if(sandwich == 0 && circleCount == 0) {
                return squareCount;
            }
            if(sandwich == 1 && squareCount == 0) {
                return circleCount;
            }
            if(sandwich == 0) {
                circleCount--;
            }
            else {
                squareCount--;
            }
        }
        return 0;
    }
}

//https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/
