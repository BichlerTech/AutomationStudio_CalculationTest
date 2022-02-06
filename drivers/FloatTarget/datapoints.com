<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=21417" name="FloatResult1" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21407" name="ns=1;i=21407" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21413" name="FloatResult2" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21409" name="ns=1;i=21409" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21405" name="FloatResult3" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21418" name="ns=1;i=21418" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21411" name="FloatResult4" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21414" name="ns=1;i=21414" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21406" name="FloatResult5" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21419" name="ns=1;i=21419" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21416" name="FloatResult6" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21447" name="ns=1;i=21447" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21400" name="FloatResult7" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21404" name="ns=1;i=21404" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21415" name="FloatResult8" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21401" name="ns=1;i=21401" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21420" name="FloatResult9" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21408" name="ns=1;i=21408" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21410" name="FloatResult10" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21412" name="ns=1;i=21412" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21403" name="FloatResult11" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21402" name="ns=1;i=21402" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
