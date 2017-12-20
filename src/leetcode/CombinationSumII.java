package leetcode;
/**
 * Date 2017/12/19
 */
import java.util.*;

public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> resultList = new ArrayList();
        if (candidates == null || candidates.length == 0) return resultList;
        Arrays.sort(candidates);
        solve(candidates, 0, target, new ArrayList(), resultList);
        return resultList;
    }

    public void solve(int[] cand, int cur, int target, List path, List res) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            res.add(new ArrayList(path));
            return;
        } else {
            for (int i = cur; i < cand.length; i++) {
                if (i > cur && cand[i] == cand[i -1]) continue;
                target -= cand[i];
                path.add(path.size(), cand[i]);
                solve(cand, i+1, target, path, res);
                path.remove(path.size() - 1);
            }
        }
    }

    
}