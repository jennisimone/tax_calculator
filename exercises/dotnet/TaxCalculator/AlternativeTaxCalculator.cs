using System;
using System.Collections.Generic;
using System.Text;

namespace TaxCalculator
{
    public class AlternativeTaxCalculator : TaxCalculator
    {
        public override int CalculateTax(Vehicle vehicle)
        {
            int[] emissionThresholds =
            {
                50,
                75,
                90,
                100,
                110,
                130,
                150,
                170,
                190,
                225,
                255
            };

            int[] taxAmounts =
            {
                0,
                15,
                95,
                115,
                135,
                155,
                195,
                505,
                820,
                1230,
                1750
            };

            if (vehicle.Co2Emissions == 0)
            {
                return 0;
            }

            for (var i = 0; i < emissionThresholds.Length; i++)
            {

                if (vehicle.Co2Emissions <= emissionThresholds[i])
                {
                    return taxAmounts[i];
                }
            }

            return 2060;
        }
    }
}
