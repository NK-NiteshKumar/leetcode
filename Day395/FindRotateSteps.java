class FindRotateSteps {
    public int findRotateSteps(String ring, String key) {
        int ringLen = ring.length();
        int keyLen = key.length();

        Map<Character, List<Integer>> characterIndices = new HashMap<>();
        for (int i = 0; i < ring.length(); i++) {
            char ch = ring.charAt(i);
            characterIndices.computeIfAbsent(ch, k -> new ArrayList<>()).add(i);
        }

        PriorityQueue<int[]> heap = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
                                                                                             
        heap.offer(new int[] { 0, 0, 0 });

        Set<Pair<Integer, Integer>> seen = new HashSet<>();

        int totalSteps = 0;
        while (!heap.isEmpty()) {
            int[] state = heap.poll();
            totalSteps = state[0];
            int ringIndex = state[1];
            int keyIndex = state[2];

            if (keyIndex == keyLen) {
                break;
            }

            Pair<Integer, Integer> currentState = new Pair<>(ringIndex, keyIndex);
            if (seen.contains(currentState)) {
                continue;
            }

            seen.add(currentState);

            for (int nextIndex : characterIndices.get(key.charAt(keyIndex))) {
                heap.offer(
                        new int[] {totalSteps + countSteps(ringIndex, nextIndex, ringLen),
                                    nextIndex, keyIndex + 1});
            }
        }

        return totalSteps + keyLen;
    }

    private int countSteps(int curr, int next, int ringLen) {
        int stepsBetween = Math.abs(curr - next);
        int stepsAround = ringLen - stepsBetween;
        return Math.min(stepsBetween, stepsAround);
    }
}

//https://leetcode.com/problems/freedom-trail/
