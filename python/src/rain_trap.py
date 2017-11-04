class RainTrap:

    def __init__(self, trap):
        self.trap = trap
        self.trap_size = len(self.trap) -1
        self.volume = 0

    def calculate_water_volume(self):
        left_bound = []
        right_bound = []

        #left traps heights
        higher_trap = self.trap[0]
        for x in self.trap:
            left_bound.append(max(higher_trap, x))

            higher_trap = self._getHighest(higher_trap, x)

        #right traps height
        higher_trap = self.trap[-1]
        reversed_trap = list(reversed(self.trap))
        for x in reversed_trap:
            right_bound.insert(0,max(higher_trap, x))

            higher_trap = self._getHighest(higher_trap, x)

        for i in range(self.trap_size):
            self.volume += min(left_bound[i], right_bound[i]) - self.trap[i]

        return self.volume

    def _getHighest(self, current, compare):
        return  compare  if current < compare else current
