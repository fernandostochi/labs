from ..src.rain_trap import RainTrap
import unittest

class RainTrapTest(unittest.TestCase):

    def test_case_1(self):
        '''
        [2, 0, 2]

        | |
        |_|

        '''
        rain_trap = RainTrap([2,0,2])
        self.assertEqual(rain_trap.calculate_water_volume(), 2)


    def test_case_2(self):
        rain_trap = RainTrap([3, 0, 0, 2, 0, 4])
        self.assertEqual(rain_trap.calculate_water_volume(), 10)

    def test_case_3(self):
        rain_trap = RainTrap([0,1,0,2,1,0,1,3,2,1,2,1])
        self.assertEqual(rain_trap.calculate_water_volume(), 6)
