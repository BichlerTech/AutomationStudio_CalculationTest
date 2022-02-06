<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=21371" name="UInt32Result1" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21368" name="ns=1;i=21368" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21374" name="UInt32Result2" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21357" name="ns=1;i=21357" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21359" name="UInt32Result3" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21370" name="ns=1;i=21370" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21367" name="UInt32Result4" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21356" name="ns=1;i=21356" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21358" name="UInt32Result5" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21373" name="ns=1;i=21373" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21444" name="UInt32Result6" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21360" name="ns=1;i=21360" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21361" name="UInt32Result7" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21366" name="ns=1;i=21366" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21363" name="UInt32Result8" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21376" name="ns=1;i=21376" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21364" name="UInt32Result9" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21365" name="ns=1;i=21365" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21362" name="UInt32Result10" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21369" name="ns=1;i=21369" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21372" name="UInt32Result11" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21375" name="ns=1;i=21375" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
