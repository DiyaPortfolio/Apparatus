#include <iostream>
#include <array>
#include <sorting.h>
#include <chrono>

std::array<int, 10000> values = {6304, 6659, 4098, 6903, 2281, 3756, 3954, 1535, 3292, 7828, 5500, 3959, 7856, 3362, 669, 8670, 5461, 1766, 4458, 4076, 8727, 5795, 2428, 590, 2924, 7899, 324, 5575, 4048, 8059, 7581, 7860, 3457, 8941, 1249, 3758, 6559, 855, 7326, 777, 2444, 4003, 9901, 7854, 2729, 1780, 7485, 6115, 2947, 3973, 6780, 5272, 4247, 7486, 8790, 8813, 7185, 4756, 4154, 2880, 7098, 8084, 5095, 613, 6332, 627, 1199, 7724, 58, 9533, 2999, 4538, 7675, 391, 2991, 2658, 1202, 5625, 4295, 2285, 967, 5857, 102, 4887, 6407, 1178, 1574, 3458, 8775, 9073, 5338, 6897, 8072, 5964, 5514, 6709, 2687, 5734, 4259, 7231, 7444, 9605, 4498, 8509, 4069, 6115, 3733, 5217, 4028, 3638, 8692, 4712, 9563, 9779, 8470, 4239, 4897, 4876, 5422, 6695, 6844, 8245, 9620, 1067, 4677, 9495, 5858, 4810, 7799, 8932, 4393, 4645, 5784, 822, 650, 5568, 329, 5563, 5415, 9445, 2367, 3364, 4239, 9366, 1268, 9901, 959, 8953, 7138, 372, 8655, 1015, 9452, 1589, 3754, 5551, 4056, 7703, 5434, 4112, 1808, 5320, 6761, 7416, 7991, 5749, 9900, 3066, 4769, 2262, 9045, 4181, 4341, 6261, 4961, 2482, 6048, 4442, 1717, 7995, 3610, 937, 4554, 228, 7762, 9321, 2955, 354, 6762, 939, 9431, 8828, 1639, 9628, 9332, 6221, 8356, 1797, 9316, 7078, 8771, 9563, 6687, 55, 4253, 5837, 9906, 3229, 6930, 1076, 1767, 1069, 345, 7841, 254, 2995, 9066, 4498, 4718, 3609, 9260, 2880, 917, 9653, 4658, 1660, 8427, 5174, 6598, 5024, 5228, 7219, 4166, 944, 5477, 2554, 8066, 8471, 7952, 2456, 4630, 7973, 129, 3049, 2566, 5282, 5566, 6603, 3291, 5854, 3496, 7609, 6969, 4022, 1374, 2875, 3953, 905, 9406, 904, 7249, 9855, 4533, 7059, 5922, 104, 7260, 7045, 172, 5382, 9445, 3065, 9647, 9337, 4852, 8913, 7932, 137, 2935, 1416, 1870, 360, 8533, 790, 9852, 3054, 8832, 6460, 5862, 4429, 8827, 4769, 2942, 3510, 6249, 8630, 9529, 9575, 6457, 3237, 2401, 4838, 5923, 9209, 9816, 5516, 5212, 1698, 7118, 122, 7052, 3114, 7939, 4508, 7141, 6389, 6682, 5123, 9939, 2690, 8320, 5798, 2060, 990, 3621, 176, 9141, 2522, 4291, 4798, 1695, 3264, 5097, 4438, 3149, 6816, 2095, 2723, 7368, 3912, 1056, 9699, 3719, 6685, 7516, 3965, 844, 6250, 5094, 7981, 9349, 4556, 7155, 3274, 7754, 5198, 5543, 9588, 6650, 7485, 8566, 5671, 3217, 1856, 9366, 2543, 7907, 5103, 5500, 8973, 3318, 1946, 7661, 6069, 8081, 655, 2312, 5760, 513, 1810, 4623, 8251, 5771, 6246, 3977, 1970, 6669, 4861, 8941, 5356, 6527, 1284, 7676, 8, 7284, 5026, 604, 874, 2718, 5099, 3660, 5024, 2253, 9642, 9541, 4787, 7800, 7393, 7839, 9344, 5419, 7591, 7976, 8030, 3973, 7393, 6627, 5288, 8469, 6598, 5477, 4477, 7758, 7834, 5138, 3397, 960, 5166, 8289, 3013, 7269, 8077, 8519, 8024, 1970, 9467, 9027, 9754, 4515, 7957, 4211, 1838, 5605, 8029, 5008, 4842, 9924, 7392, 146, 4127, 1779, 6465, 7311, 7658, 5730, 2063, 5195, 1267, 4994, 1130, 9510, 545, 8041, 6390, 2594, 151, 3462, 1466, 5274, 6668, 3484, 5473, 1183, 4025, 631, 351, 6299, 1650, 13, 732, 9217, 3726, 6811, 2796, 1925, 7583, 2244, 3206, 4352, 9210, 2736, 6385, 2286, 8634, 2500, 8825, 9130, 3773, 8028, 3069, 2205, 1632, 417, 7375, 5878, 6211, 5944, 8642, 2657, 7549, 9893, 4860, 6519, 2868, 4208, 6344, 5038, 951, 1603, 3967, 8527, 2284, 6875, 6959, 8805, 9237, 3359, 7278, 6202, 3181, 1081, 2636, 9312, 6463, 6519, 8312, 3658, 514, 7783, 3637, 5323, 4406, 3071, 9042, 9331, 4255, 4585, 6495, 1434, 7964, 8310, 4571, 2732, 8255, 61, 8047, 7659, 2379, 8762, 8734, 4416, 982, 7107, 3576, 2514, 2678, 5304, 1152, 1708, 5980, 2462, 7556, 9929, 6942, 8849, 3609, 9880, 4794, 757, 4495, 6335, 662, 3002, 4574, 2853, 5208, 1466, 6880, 610, 6449, 8227, 3474, 9620, 7824, 6712, 8680, 5427, 3260, 9499, 3754, 1145, 3925, 4209, 4063, 3318, 1980, 9210, 4518, 9330, 4895, 5283, 5203, 2235, 7660, 8925, 5809, 7782, 3394, 1265, 9646, 2383, 5457, 7457, 440, 4609, 2948, 2965, 5604, 3920, 959, 7850, 5191, 2122, 7985, 6286, 4929, 4127, 843, 6134, 9366, 2289, 3371, 6077, 5850, 4112, 167, 2017, 356, 8271, 9785, 4575, 1730, 5263, 2880, 7053, 3448, 8302, 6525, 1973, 8747, 4907, 9742, 9570, 5596, 5025, 77, 4982, 3695, 9745, 4747, 7585, 2256, 9557, 7808, 5177, 8720, 6884, 3029, 5077, 7498, 6923, 1753, 8720, 8189, 9970, 9236, 6550, 5623, 2815, 6825, 9231, 121, 4607, 2794, 4373, 3008, 3578, 8901, 6899, 8185, 8906, 3041, 3116, 3350, 3254, 553, 6681, 7602, 4459, 5207, 7697, 9218, 4113, 1316, 9152, 4599, 1336, 4066, 1285, 3611, 5574, 246, 4811, 2307, 5641, 7201, 2300, 5213, 9725, 8673, 1549, 4924, 2030, 928, 2475, 1583, 2649, 3697, 2419, 3849, 9968, 2522, 8112, 3321, 440, 2519, 7335, 1373, 9177, 9514, 281, 8941, 398, 7565, 6483, 9321, 2523, 9477, 2388, 7209, 9055, 9326, 2638, 3194, 7206, 4920, 3827, 4518, 1284, 2898, 3280, 6994, 9736, 4743, 5141, 4303, 8350, 7515, 527, 4927, 3971, 6928, 6656, 9936, 9586, 8419, 3832, 2794, 7066, 9949, 9241, 9352, 3974, 3695, 58, 6390, 9292, 3170, 7134, 5682, 9109, 2374, 435, 6340, 6281, 9249, 4197, 1552, 1652, 1183, 3804, 3680, 6646, 748, 5031, 1367, 7937, 9866, 1672, 394, 2178, 2593, 4636, 5741, 1451, 494, 7627, 2209, 9284, 2169, 1752, 2268, 2683, 7650, 1415, 2804, 1830, 7672, 1524, 2074, 2843, 2290, 7224, 1989, 733, 27, 7655, 8680, 9926, 5336, 941, 921, 3423, 6951, 5170, 6221, 7429, 4276, 1226, 3402, 40, 1850, 2432, 620, 2545, 8388, 4727, 7905, 5152, 768, 1127, 8372, 778, 6412, 6316, 8621, 8917, 4782, 4568, 4274, 4779, 8725, 5353, 4875, 1120, 7663, 6014, 7834, 1773, 1462, 5946, 580, 9029, 9504, 3847, 2860, 6489, 7914, 8241, 8975, 6478, 5695, 5332, 7340, 1524, 7856, 4176, 1294, 3031, 7820, 5721, 7863, 6585, 260, 2587, 4946, 4531, 691, 2571, 2055, 5016, 9562, 7432, 188, 3898, 6116, 574, 521, 2157, 6041, 3958, 5853, 5237, 9640, 8325, 1359, 7421, 3060, 6106, 8999, 3841, 8167, 2535, 1538, 7982, 2612, 5562, 4420, 6876, 8234, 989, 4711, 6984, 1649, 1656, 6699, 6451, 1827, 714, 2265, 6641, 7522, 7628, 3788, 2058, 177, 3321, 5509, 1475, 8663, 162, 2532, 3198, 3205, 3858, 5973, 9961, 1511, 5781, 6292, 7823, 8957, 5204, 9516, 4779, 4041, 7043, 8594, 5918, 8118, 9567, 8891, 9987, 2721, 5825, 6735, 6830, 906, 8108, 6196, };
int main() {
    auto start = std::chrono::high_resolution_clock::now();
    sort<quick_sort_iterative_policy_t>(values);
    auto stop = std::chrono::high_resolution_clock::now();
    auto duration = std::chrono::duration_cast<std::chrono::milliseconds>(stop - start);
    std::cout << duration.count() << std::endl;
}