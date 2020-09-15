<?php
/**
 * Autogenerated by Thrift Compiler (0.13.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
use Thrift\Base\TBase;
use Thrift\Type\TType;
use Thrift\Type\TMessageType;
use Thrift\Exception\TException;
use Thrift\Exception\TProtocolException;
use Thrift\Protocol\TProtocol;
use Thrift\Protocol\TBinaryProtocolAccelerated;
use Thrift\Exception\TApplicationException;

class TGetInfoValue
{
    static public $isValidate = false;

    static public $_TSPEC = array(
        1 => array(
            'var' => 'stringValue',
            'isRequired' => false,
            'type' => TType::STRING,
        ),
        2 => array(
            'var' => 'smallIntValue',
            'isRequired' => false,
            'type' => TType::I16,
        ),
        3 => array(
            'var' => 'integerBitmask',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        4 => array(
            'var' => 'integerFlag',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        5 => array(
            'var' => 'binaryValue',
            'isRequired' => false,
            'type' => TType::I32,
        ),
        6 => array(
            'var' => 'lenValue',
            'isRequired' => false,
            'type' => TType::I64,
        ),
    );

    /**
     * @var string
     */
    public $stringValue = null;
    /**
     * @var int
     */
    public $smallIntValue = null;
    /**
     * @var int
     */
    public $integerBitmask = null;
    /**
     * @var int
     */
    public $integerFlag = null;
    /**
     * @var int
     */
    public $binaryValue = null;
    /**
     * @var int
     */
    public $lenValue = null;

    public function __construct($vals = null)
    {
        if (is_array($vals)) {
            if (isset($vals['stringValue'])) {
                $this->stringValue = $vals['stringValue'];
            }
            if (isset($vals['smallIntValue'])) {
                $this->smallIntValue = $vals['smallIntValue'];
            }
            if (isset($vals['integerBitmask'])) {
                $this->integerBitmask = $vals['integerBitmask'];
            }
            if (isset($vals['integerFlag'])) {
                $this->integerFlag = $vals['integerFlag'];
            }
            if (isset($vals['binaryValue'])) {
                $this->binaryValue = $vals['binaryValue'];
            }
            if (isset($vals['lenValue'])) {
                $this->lenValue = $vals['lenValue'];
            }
        }
    }

    public function getName()
    {
        return 'TGetInfoValue';
    }


    public function read($input)
    {
        $xfer = 0;
        $fname = null;
        $ftype = 0;
        $fid = 0;
        $xfer += $input->readStructBegin($fname);
        while (true) {
            $xfer += $input->readFieldBegin($fname, $ftype, $fid);
            if ($ftype == TType::STOP) {
                break;
            }
            switch ($fid) {
                case 1:
                    if ($ftype == TType::STRING) {
                        $xfer += $input->readString($this->stringValue);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 2:
                    if ($ftype == TType::I16) {
                        $xfer += $input->readI16($this->smallIntValue);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 3:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->integerBitmask);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 4:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->integerFlag);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 5:
                    if ($ftype == TType::I32) {
                        $xfer += $input->readI32($this->binaryValue);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                case 6:
                    if ($ftype == TType::I64) {
                        $xfer += $input->readI64($this->lenValue);
                    } else {
                        $xfer += $input->skip($ftype);
                    }
                    break;
                default:
                    $xfer += $input->skip($ftype);
                    break;
            }
            $xfer += $input->readFieldEnd();
        }
        $xfer += $input->readStructEnd();
        return $xfer;
    }

    public function write($output)
    {
        $xfer = 0;
        $xfer += $output->writeStructBegin('TGetInfoValue');
        if ($this->stringValue !== null) {
            $xfer += $output->writeFieldBegin('stringValue', TType::STRING, 1);
            $xfer += $output->writeString($this->stringValue);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->smallIntValue !== null) {
            $xfer += $output->writeFieldBegin('smallIntValue', TType::I16, 2);
            $xfer += $output->writeI16($this->smallIntValue);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->integerBitmask !== null) {
            $xfer += $output->writeFieldBegin('integerBitmask', TType::I32, 3);
            $xfer += $output->writeI32($this->integerBitmask);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->integerFlag !== null) {
            $xfer += $output->writeFieldBegin('integerFlag', TType::I32, 4);
            $xfer += $output->writeI32($this->integerFlag);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->binaryValue !== null) {
            $xfer += $output->writeFieldBegin('binaryValue', TType::I32, 5);
            $xfer += $output->writeI32($this->binaryValue);
            $xfer += $output->writeFieldEnd();
        }
        if ($this->lenValue !== null) {
            $xfer += $output->writeFieldBegin('lenValue', TType::I64, 6);
            $xfer += $output->writeI64($this->lenValue);
            $xfer += $output->writeFieldEnd();
        }
        $xfer += $output->writeFieldStop();
        $xfer += $output->writeStructEnd();
        return $xfer;
    }
}
