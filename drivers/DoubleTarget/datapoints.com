<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=21431" name="DoubleResult1" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21429" name="ns=1;i=21429" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21433" name="DoubleResult2" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21426" name="ns=1;i=21426" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21441" name="DoubleResult3" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21424" name="ns=1;i=21424" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21440" name="DoubleResult4" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21422" name="ns=1;i=21422" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21425" name="DoubleResult5" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21439" name="ns=1;i=21439" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21434" name="DoubleResult6" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21446" name="ns=1;i=21446" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21423" name="DoubleResult7" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21428" name="ns=1;i=21428" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21442" name="DoubleResult8" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21435" name="ns=1;i=21435" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21437" name="DoubleResult9" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21432" name="ns=1;i=21432" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21430" name="DoubleResult10" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21436" name="ns=1;i=21436" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21438" name="DoubleResult11" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21427" name="ns=1;i=21427" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
