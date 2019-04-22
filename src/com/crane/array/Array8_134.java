package com.crane.array;

/*
*
【笔记】一次遍历法，车能开完全程需要满足两个条件：

车从i站能开到i+1。

所有站里的油总量要>=车子的总耗油量。

那么，假设从编号为0站开始，一直到k站都正常，在开往k+1站时车子没油了。这时，应该将起点设置为k+1站。

————

问题1: 为什么应该将起始站点设为k+1？

因为k->k+1站耗油太大，0->k站剩余油量都是不为负的，每减少一站，就少了一些剩余油量。
所以如果从k前面的站点作为起始站，剩余油量不可能冲过k+1站。

————

问题2: 为什么如果k+1->end全部可以正常通行，且rest>=零就可以说明车子从k+1站点出发可以开完全程？

因为，起始点将当前路径分为A、B两部分。其中，必然有A部分剩余油量<0。B部分剩余油量>0。

所以，无论多少个站，都可以抽象为两个站点（A、B）。从B站加满油出发，开往A站，车加油，再开回B站的过程。

重点：B剩余的油>=A缺少的总油。必然可以推出，B剩余的油>=A站点的每个子站点缺少的油。
* */

public class Array8_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int rest = 0, run = 0, start = 0;
        for (int i = 0; i < gas.length; i++) {
            run += (gas[i] - cost[i]);
            rest += (gas[i] - cost[i]);
            if (run < 0) {
                start = i + 1;
                run = 0;
            }
        }

        return rest < 0 ? -1: start;
    }

    /*
The algorithm is pretty easy to understand. Imagine we take a tour around this circle,
the only condition that we can complete this trip is to have more fuel provided than costed in total.
That's what the first loop does.

If we do have more fuel provided than costed,
that means we can always find a start point around this circle that we could complete the journey with an empty tank.
Hence, we check from the beginning of the array,
if we can gain more fuel at the current station, we will maintain the start point, else,
which means we will burn out of oil before reaching to the next station,
we will start over at the next station.
    * */

    public int canCompleteCircuit2(int[] gas, int[] cost) {

        int tank = 0;
        for (int i = 0; i < gas.length; i++) {
            tank += gas[i] - cost[i];
        }
        if (tank < 0) {
            return -1;
        }

        int start = 0;
        int accumulate = 0;
        for (int i = 0; i < gas.length; i++) {
            int curGain = gas[i] - cost[i];
            if (accumulate + curGain < 0) {
                start = i + 1;
                accumulate = 0;
            } else {
                accumulate += curGain;
            }
        }
        return start;
    }

    private void test() {

        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};

        int result = canCompleteCircuit(gas, cost);
        System.out.println(result);
    }

    public static void main(String[] args) {

        new Array8_134().test();
    }
}
