<?xml version="1.0" encoding="UTF-8"?>
<CalculationConfiguration>
  <calculations>
    <calc>
      <target ns="bichler.tech" id="i=21354" name="UInt16Result1" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21345" name="ns=1;i=21345" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21348" name="UInt16Result2" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21350" name="ns=1;i=21350" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21349" name="UInt16Result3" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21351" name="ns=1;i=21351" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21352" name="UInt16Result4" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21343" name="ns=1;i=21343" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21339" name="UInt16Result5" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21340" name="ns=1;i=21340" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21353" name="UInt16Result6" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21346" name="ns=1;i=21346" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21336" name="UInt16Result7" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21347" name="ns=1;i=21347" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21337" name="UInt16Result8" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21341" name="ns=1;i=21341" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21338" name="UInt16Result9" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21443" name="ns=1;i=21443" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21344" name="UInt16Result10" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21334" name="ns=1;i=21334" index="-1"/>
      <operation value=");" />
    </calc>
    <calc>
      <target ns="bichler.tech" id="i=21342" name="UInt16Result11" index="-1"/>
      <active value="true" />
      <calcevent value="CYCLIC" timeout="1000"/>
      <operation value="return(" />
      <node ns="bichler.tech" id="i=21335" name="ns=1;i=21335" index="-1"/>
      <operation value=");" />
    </calc>
  </calculations>
</CalculationConfiguration>
