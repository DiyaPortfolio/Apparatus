package Examples;

class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{920, 7365, 3547, 5119, 426, 7453, 5300, 7961, 5005, 1244, 1631, 3833, 4768, 9249, 651, 9977, 2398, 7796, 4913, 7558, 9007, 9561, 9783, 8770, 3679, 5364, 3524, 6099, 7058, 6290, 9815, 8524, 2295, 7876, 8582, 4902, 3510, 3531, 2831, 8025, 2007, 8168, 2109, 2770, 2590, 1063, 5229, 9185, 4474, 8181, 8475, 2232, 2208, 7497, 6635, 1551, 2346, 7050, 6592, 9771, 492, 9661, 1181, 6066, 8048, 5979, 9356, 5843, 4469, 103, 8877, 948, 8672, 2779, 2976, 6423, 7588, 7789, 4786, 271, 1992, 2586, 5485, 27, 357, 2706, 5499, 9530, 3611, 1185, 2661, 8275, 1952, 844, 8175, 5422, 8274, 2269, 701, 4795, 2153, 798, 311, 17, 4941, 2182, 1578, 702, 7208, 7398, 165, 9182, 9918, 6250, 9100, 866, 8388, 5504, 4606, 1956, 6299, 4195, 4106, 8324, 2746, 3725, 2121, 8943, 6372, 5955, 5291, 39, 5328, 456, 4500, 3803, 3092, 3285, 7237, 8740, 5295, 4357, 8375, 7201, 4120, 4874, 6018, 3330, 9890, 9369, 8158, 9659, 730, 9220, 7212, 4982, 7945, 3993, 2842, 7276, 3360, 5715, 9520, 6768, 630, 2203, 9961, 1152, 7004, 86, 2387, 3394, 6530, 8807, 7736, 515, 1600, 4284, 9939, 3575, 168, 5896, 5016, 8395, 7560, 790, 7054, 3897, 383, 5892, 3695, 7893, 9666, 7433, 7163, 1415, 132, 3362, 8173, 8424, 2114, 2854, 9324, 8455, 9694, 3639, 2795, 1066, 5986, 4201, 795, 9233, 469, 7980, 9803, 102, 9630, 7773, 3351, 9935, 134, 1331, 7123, 5676, 8059, 3039, 5562, 7929, 1132, 7904, 7184, 4022, 6219, 4946, 1024, 538, 7645, 7669, 9926, 9652, 8673, 5744, 525, 2488, 4882, 6768, 357, 9188, 4640, 8513, 2729, 4333, 6347, 4499, 7, 9440, 2980, 1633, 2517, 1012, 2025, 8528, 5563, 6549, 6356, 159, 531, 8584, 9355, 8268, 251, 5713, 7107, 5204, 301, 9519, 4097, 1161, 9762, 8852, 2704, 5613, 8423, 2866, 9959, 6971, 613, 4832, 5317, 8187, 8172, 5630, 3640, 2345, 3843, 7799, 8681, 6926, 376, 6217, 8954, 2826, 4629, 7501, 5764, 9397, 761, 1263, 7239, 4608, 112, 3830, 3637, 9397, 5609, 2232, 8773, 6148, 2388, 5619, 351, 2648, 2199, 1320, 9104, 1859, 3569, 9377, 5512, 3037, 3805, 4950, 4089, 5084, 9181, 794, 5349, 1880, 9397, 556, 5153, 6600, 3606, 731, 4028, 6678, 649, 6381, 2612, 1474, 5532, 9976, 2231, 8801, 7847, 4937, 5638, 57, 8729, 3083, 6740, 1542, 1443, 2681, 8648, 6753, 3980, 1521, 2240, 6947, 935, 8425, 2561, 1475, 8320, 4775, 1014, 2538, 9203, 3506, 3790, 5629, 6794, 7612, 9445, 2143, 4825, 4666, 9507, 4619, 9109, 7363, 2706, 2556, 6520, 601, 3125, 3222, 9040, 6943, 2927, 7211, 5957, 3232, 9799, 1907, 8843, 4427, 6427, 5252, 1766, 7297, 6582, 7815, 9200, 6223, 1150, 4291, 3641, 3047, 2584, 4068, 9272, 1549, 5783, 4376, 1215, 9996, 3958, 4271, 5609, 3965, 4371, 6524, 2507, 3594, 5583, 1866, 2199, 6456, 7632, 8821, 8092, 4247, 2301, 648, 4607, 6610, 8028, 8848, 1732, 1782, 217, 4918, 4060, 6465, 2328, 5905, 5888, 6371, 5125, 9143, 6939, 4939, 5829, 7568, 266, 3052, 9075, 7797, 485, 2416, 6293, 7294, 4430, 3352, 921, 9452, 2670, 9287, 3689, 9188, 2412, 7985, 712, 6442, 4030, 2811, 5795, 1623, 6978, 3200, 6253, 4186, 1115, 8436, 131, 3691, 5832, 682, 6779, 8964, 9872, 5843, 3834, 5610, 4243, 3742, 6159, 1605, 9101, 836, 8760, 9877, 225, 6822, 4450, 1040, 6353, 1318, 7769, 3548, 9438, 2193, 8670, 7020, 126, 8580, 9666, 4352, 1359, 7775, 3847, 6327, 7689, 3530, 9433, 6838, 8230, 9297, 1404, 1830, 9838, 962, 5211, 7832, 8530, 7476, 1968, 4393, 5627, 5283, 7995, 5739, 4040, 5341, 9059, 306, 703, 3680, 9354, 478, 4316, 1823, 3753, 9193, 7754, 4854, 4703, 5939, 9184, 6884, 2649, 1854, 2861, 9791, 1212, 8209, 829, 9305, 9228, 8764, 4770, 9180, 1270, 9029, 3802, 9971, 9966, 8238, 3847, 2625, 9238, 6390, 873, 895, 205, 1775, 2988, 3826, 9550, 705, 2637, 3452, 9021, 7078, 8364, 6446, 9773, 6793, 7290, 6426, 2637, 7449, 5534, 6430, 6544, 6143, 2059, 169, 2229, 9689, 8284, 3525, 538, 9770, 4446, 7469, 662, 4011, 3820, 9974, 6076, 6292, 178, 2719, 9733, 5476, 9789, 3277, 5432, 7103, 4996, 1431, 6152, 3464, 9100, 4322, 7495, 4897, 3971, 142, 6713, 549, 1525, 3650, 8857, 346, 2766, 1577, 1023, 3346, 5258, 368, 1505, 7991, 9637, 424, 3831, 5647, 3244, 1054, 2599, 1570, 5846, 1330, 3528, 4777, 9030, 1326, 1796, 9315, 7516, 3945, 6583, 5965, 3792, 8367, 2237, 953, 1963, 180, 5144, 8928, 9456, 5594, 9949, 543, 4705, 9170, 381, 9549, 5903, 4724, 5177, 8791, 8973, 9893, 9124, 6211, 3715, 1840, 3225, 9128, 2230, 2536, 273, 8803, 8156, 6773, 9600, 1895, 4871, 7998, 7982, 8337, 5867, 1168, 7786, 2763, 7899, 2126, 3607, 4101, 5439, 4158, 4881, 9160, 8932, 7898, 4146, 3291, 9042, 7369, 5395, 435, 8814, 7208, 4690, 5292, 601, 7410, 6478, 2010, 3108, 2418, 8959, 1910, 5024, 2417, 345, 836, 5404, 9274, 4441, 6381, 1195, 4668, 7029, 4438, 5975, 7638, 366, 2776, 6504, 4346, 6474, 2283, 4028, 9553, 8317, 2872, 3873, 4200, 5167, 883, 920, 8499, 1112, 4710, 8250, 2057, 6223, 9099, 5262, 2788, 6458, 7984, 3135, 4675, 9631, 4610, 5327, 2079, 7623, 2961, 6651, 8375, 3373, 3629, 4296, 5353, 1046, 7364, 2305, 5695, 5686, 988, 4184, 8325, 9387, 1473, 1574, 4464, 1026, 1657, 2546, 364, 2029, 3767, 4113, 1770, 2402, 6225, 6671, 5831, 5053, 669, 9352, 6992, 6331, 536, 5689, 1481, 8213, 6370, 5045, 1020, 2529, 5593, 8714, 470, 4993, 7640, 2841, 4320, 6317, 391, 6295, 6602, 8252, 8675, 9437, 6232, 8783, 1570, 2355, 6465, 6904, 5853, 4785, 2669, 2472, 5908, 5044, 5941, 7328, 2589, 5661, 5116, 6258, 5503, 9416, 1364, 9718, 4933, 6551, 1647, 4739, 7338, 2073, 6938, 5258, 1396, 2971, 764, 5719, 4995, 3653, 5476, 9629, 1525, 6932, 5112, 4080, 9459, 9352, 3066, 4131, 8754, 6901, 2530, 4400, 1290, 7677, 284, 8437, 3303, 25, 4167, 7104, 1006, 4918, 8271, 4307, 9344, 9171, 3879, 1061, 8708, 5737, 9306, 7373, 2664, 6711, 1650, 6631, 1585, 3033, 9423, 3782, 4335, 2914, 513, 727, 39, 4974, 570, 1877, 5275, 1044, 1238, 7540, 4912, 8206, 9970, 3932, 170, 6265, 85, 4121, 5720, 7469, 4907, 1692, 2599, 8412, 4772, 6436, 427, 1612, 1912, 9216, 3099, 6634, 6642, 8941, 8946, 9343, 159, 2985, 4208, 7379, 3455, 3329, 7895, 2898, 5110, 9113, 8426, 5360, 2345, 5994, 5793, 4227, 5077, 3189, 9458, 662, 7735, };
        
        long startTime = System.currentTimeMillis();
        insertion(arr);
        long endTime = System.currentTimeMillis();
        System.out.println(startTime);
        System.out.println(endTime);
        System.out.println(endTime - startTime);
    }

    public static void insertion(int[] arr) {
        int key, j;
        for (int i = 1; i < arr.length; i++) {
            key = arr[i];
            j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}