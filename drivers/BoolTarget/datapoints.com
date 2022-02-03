<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=30" name="BoolResult1" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=31" name="BoolResult2" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=32" name="BoolResult3" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=33" name="BoolResult4" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=34" name="BoolResult5" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=39" name="BoolResult6" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
    </calc>
  </calculations>
</CalculationConfiguration>
