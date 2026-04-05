9# data-structure

## learn data structure

### language: java
这份文档包含了多份编程测试题，涵盖了算法、数据结构、数学计算及逻辑推理等多个方面。为了方便你查阅，我将文档中提取到的所有题目进行了去重和分类整理。

以下是按题目类型分类的详细题目列表：

1. 数组与字符串处理 (Strings & Arrays)

字符串差异检测
*   场景：Arnold 发现网络传输中丢失了一个字符。
*   任务：对比发送端字符串 stringSent 和接收端字符串 stringRec，找出丢失的字符。
*   输入：两个仅包含英文字母的字符串。

子串出现次数统计 (重叠匹配)
*   场景：儿童单词识别游戏。
*   规则：不区分大小写，统计单词在句子中的出现次数（包含重叠情况）。
*   输入：句子 sentence 和单词 word。

元音消除
*   任务：从给定字符串中移除所有元音字母（a, e, i, o, u 及其大写）。

列表索引置换
*   任务：给定一个由 0 到 N-1 组成的唯一正数列表，将每个元素的值替换为其在原列表中的索引位置。
*   示例：输入 [3, 2, 0, 1] 输出 [2, 3, 1, 0]。

LRU 缓存缺失计算
*   场景：操作系统虚拟内存管理。
*   机制：实现 LRU（最近最少使用）缓存淘汰策略。
*   目标：根据页面请求序列和缓存大小，计算缓存缺失（Cache Miss）的次数。

寻找第 K 小元素
*   任务：给定 N 个股票的相对价格，找出第 K 小的价格。

寻找小于 K 的元素个数
*   任务：给定一个整数列表和整数 K，统计列表中严格小于 K 的元素个数。

2. 动态规划与贪心算法 (DP & Greedy)

实习生任务收益最大化 (Stephen)
*   场景：Stephen 实习 N 天。每天可选简单任务(Easy)、困难任务(Hard)或休息。
*   规则：只有前一天休息时，当天才能做困难任务。Hard 报酬始终高于 Easy。
*   目标：计算 N 天内能获得的最大薪水。

推销员工作天数 (Moche Goldberg)
*   场景：推销员在 N 个城镇工作。相邻两天不能在同一个镇，每个镇有最大访问次数限制。
*   目标：计算他能工作的最大天数。

团队错误分值消除 (Ethan)
*   场景：团队成员有错误分值。完成一个项目，该成员分值减 P，其他所有分值>0的成员分值减 Q。
*   目标：计算使所有成员错误分值归零所需的最少项目完成次数。

书籍购买预算优化 (Sheldon)
*   场景：Sheldon 有固定预算，需购买 Horror 和 Sci-fi 两类书。
*   规则：每类至少买一本。
*   目标：在预算内最大化购买书籍的总星评级。若无法满足条件（买不起两类），输出 -1。

3. 数学与几何计算 (Mathematics & Geometry)

秘密代码加密 (Bob)
*   算法：基于公式 (((S^N % 10)^M) % 1000000007) 对代码进行加密。

圆形区域交集计算
*   场景：计算两个圆的相交面积。
*   输入：两个圆的圆心坐标 (x, y) 和半径 r。
*   输出：相交面积，保留 6 位小数。

素数筛选
*   任务：给定正整数 num，输出从 2 到 num 之间所有的素数。

街道灯故障模拟 (Mr. Woods)
*   规则：8 盏街灯。若某灯相邻两灯状态相同（同亮或同灭），则该灯次日熄灭；端点视为另一侧始终熄灭。
*   目标：计算 M 天后路灯的状态序列。

父子脚步匹配 (Martin)
*   场景：父亲匀速走，Martin 需选择速度 V_2，使得他踩到父亲脚印的次数 F 最大。
*   目标：若有多解，输出最大的 V_2。

4. 图论与树结构 (Graphs & Trees)

树形道路最大通行费 (Transportation)
*   场景：N 个城市构成树状结构，每条道路的通行费等于经过该道路的路径数量。
*   目标：找出通行费收入最高的道路（输出连接的两个城市 ID）。

魔法师旅行路径 (Magician)
*   场景：N 个城市间有双向道路，魔法师可使用 K 次魔法使道路距离归零。
*   目标：计算两点间最短路径，若无路径输出 -1。

推销员最短路径 (Gregor)
*   场景：Gregor 在 Cartesian 坐标系中的城市间旅行。
*   规则：从第 K 个零售商出发，需访问所有零售商（含总部）。
*   目标：计算最短总旅行距离。

社交网络推广策略
*   场景：在有向社交网络中推广产品。
*   规则：用户收到消息后可分享给朋友，朋友若已收到则不再传播。
*   目标：选择起始用户 ID，使得消息能覆盖最多的用户墙壁（即传播范围最大）。

5. 模拟与逻辑游戏 (Simulation)

甜品店交付时间优化 (William)
*   场景：William 需交付订单。可选择：用旧机器生产（耗时 prepTime）、花钱买成品、或花钱买新机器（效率更高）。
*   目标：在预算约束下，计算完成订单的最短时间（结果需对 1000007 取模）。

图书馆借阅顺序 (Stephen)
*   规则：学生需借阅特定书籍完成作业，书籍归还后方可被借出。按学生 ID 循环分配。
*   目标：输出学生完成作业的最优顺序，若无法完成输出 -1。

销售数据回文列表 (Assistant Sales Manager)
*   规则：可以将列表中任意两个连续元素求和合并为一个元素。
*   目标：通过合并操作，将给定列表转换为最长的回文列表。

旋转字符串前缀 (Peter)
*   场景：两个字符串，其中一个可旋转（左旋或右旋）。
*   目标：找出使两字符串最长公共前缀最大的最小旋转次数。

###新总结
这份文档汇集了多份编程测试题与算法挑战，涵盖了从基础逻辑处理到复杂图论、动态规划等多个计算机科学领域。以下是各题目板块的详细分类总结：

💼 一、职场与商业场景算法
该部分包含多个基于实际工作场景的算法设计题，旨在解决特定的业务逻辑问题。

1. 实习生薪酬最大化（Stephen）
- 背景：Stephen 在 N 天的实习期内，每天可选择做简单任务、困难任务或休息。
- 规则：只有在前一天未工作的情况下，当天才能选择困难任务；公司对困难任务的支付永远高于简单任务。
- 目标：计算 Stephen 能获得的最大薪资。
- 输入：天数 N，每日简单与困难任务的报酬。
- 输出：最大薪资整数。

2. 图书促销采购（Sheldon）
- 背景：Sheldon 在书展购买 Horror 和 Sci-fi 两类书籍。
- 规则：预算有限，每类至少买一本，需最大化总星评级。
- 目标：在预算内求两类书组合的最大星评级，若无法满足条件则输出 -1。
- 输入：预算金额，两类书的数量及各自的星评级与价格。
- 输出：最大星评级或 -1。

3. 甜品店交付优化（William）
- 背景：William 需交付 numOfBox 盒甜品，旧机器制作一盒需 prepTime 分钟。
- 策略：可用资金购买新机器（效率不同）或直接购买成品，旧机器一旦更换即报废。
- 目标：求交付订单的最短时间（结果需取模）。
- 输入：订单数量、旧机时间、资金、可购机器列表（时间/成本）、可购商店列表（数量/成本）。
- 输出：最短交付时间。

4. 库存管理与项目完成（Ethan）
- 背景：团队成员有错误分值，完成项目可降低分值。
- 规则：成员完成项目，自身分值降 P，其他大于 0 的成员分值降 Q。
- 目标：求让所有成员分值归零所需的最少项目完成次数。
- 输入：成员数、初始分值、P、Q。
- 输出：最少项目次数。

5. 网络数据丢失检测
- 背景：网络加密传输中丢失了一个字符。
- 目标：对比发送端与接收端的字符串，找出丢失的字符。
- 输入：发送字符串 stringSent，接收字符串 stringRec。
- 输出：丢失的字符。

🎮 二、游戏与趣味逻辑算法
该部分题目多涉及特定规则下的数值计算或逻辑推演。

1. 秘密代码加密（Bob）
- 公式：使用公式 (((S^N % 10)^M) % 1000000007) 加密代码。
- 输入：秘密代码 S，密钥 N 和 M。
- 输出：加密后的整数。

2. 街灯状态模拟（Mr. Woods）
- 背景：8 盏街灯连接错误。
- 规则：若某灯相邻的两盏灯状态相同（同亮或同灭），则该灯次日熄灭；两端的灯视为另一侧始终熄灭。
- 目标：计算 M 天后街灯的状态。
- 输入：初始状态，天数 M。
- 输出：M 天后的灯状态。

3. 旋转字符串前缀（Peter）
- 背景：两个等长字符串，第一个固定，第二个可左右旋转。
- 目标：求获得最长公共前缀所需的最少旋转次数，无公共前缀则输出 -1。

4. 虚拟内存管理（LRU Cache）
- 背景：操作系统虚拟内存管理使用 LRU 缓存机制。
- 目标：给定缓存大小和页面请求序列，计算缓存未命中（Cache Miss）的次数。

📊 三、数据处理与字符串操作
该部分主要考察对字符串和数组的基础处理能力。

1. 子串与子序列统计
- 字符串包含统计：计算第二个字符串在第一个字符串中出现的次数（忽略大小写）。
- 单词计数游戏：在句子中查找给定单词的出现次数（不区分大小写，可能重叠）。
- 元音消除：从给定字符串中移除所有元音字母（aeiou, 大小写）。

2. 数组变换与查找
- Kth 最小值查找：在 N 个股票价格中找到第 K 小的值。
- 列表回文转换：通过合并相邻元素，将给定列表转换为最长的回文列表。
- 索引值替换：给定一个由 0 到 N-1 组成的列表，将每个数值替换为其对应的索引值。

🌍 四、几何与图论算法
该部分涉及复杂的数学计算与图论路径优化。

1. 几何计算
- 圆面积交集：给定两个圆的圆心坐标和半径，计算两圆相交部分的面积（保留6位小数）。
- 旅行推销员问题（Cartesia）：在笛卡尔坐标系中，从第 K 个零售商出发，访问所有零售商（含位于 (X_{n+1}, Y_{n+1}) 的总部）的最短路径总距离。

2. 图论与树结构
- 社交网络推广：在有向图中寻找一个用户，使其发布消息后，消息能通过朋友关系传播到最多的用户墙面上。
- 道路收费最大化：在一棵树形道路网中，计算每条道路作为最多路径必经之路的次数（Toll），找出收费最高的道路连接的城市对。
- 魔法师旅行：在双向图中，魔法师可使用 K 次魔法将道路距离归零，求两城市间的最短路径。

这份文档实质上是一套涵盖算法设计、数据结构、数学计算及逻辑推理的综合性编程题库，适用于考察程序员在模拟、动态规划、图论及基础字符串处理等方面的综合能力。



We emphasize the submission of a fully working code over partially correct but efficient code. Once submitted, you cannot review this problem again. You can use System.out.println() to debug your code. The System.out.println() may not work in case of syntax/runtime error. The version of Java 11 being used is 11.0.2.
Note: The main class name must be "Solution".
Stephen is doing an internship in a company for N days. Each day, he may choose an easy task or a difficult task. He may also choose to perform no task at all. He chooses a difficult task on days when and only when he did not perform any work the previous day. The amounts paid by the company for both the easy and difficult tasks can vary each day, but the company always pays more for difficult tasks.
Write an algorithm to help Stephen earn the maximum salary.
Input
The first line of the input consists of two space-separated integers: num and type, representing the number of days of the internship (N) and types of tasks available for each day (M is always equal to 2, respectively).
The next N lines consist of M space-separated integers: easy and hard, representing the amount set to be paid for the easy task and the difficult task on that day, respectively.
Output
Print an integer representing the maximum salary that Stephen can earn.
Constraints
1 ≤ num ≤ 10⁵
type = 2
2 ≤ hard ≤ 10⁴
1 ≤ easy < hard
Example
Input:
4 2
1 2
4 10
20 21
2 23
Output:
33
Explanation:
To earn the maximum salary, select the difficult task (10) from the 2nd row and the difficult task (23) from the 4th row. The maximum salary earned = 10 + 23 = 33.
