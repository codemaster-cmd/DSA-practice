class Solution {
    public int calPoints(String[] operations) {

        ArrayList<Integer> list = new ArrayList<>();

        for (String op : operations) {

            if (op.equals("C")) {
                list.remove(list.size() - 1);
            }

            else if (op.equals("D")) {
                int n = list.size();
                int last = list.get(n - 1);

                list.add(last * 2);
            }

            else if (op.equals("+")) {
                int n = list.size();

                int last = list.get(n - 1);
                int secondLast = list.get(n - 2);

                list.add(last + secondLast);
            }

            else {
                list.add(Integer.parseInt(op));
            }
        }

        int sum = 0;

        for (int score : list) {
            sum += score;
        }

        return sum;
    }
}