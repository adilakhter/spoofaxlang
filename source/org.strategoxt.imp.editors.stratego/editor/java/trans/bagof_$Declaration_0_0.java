package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bagof_$Declaration_0_0 extends Strategy 
{ 
  public static bagof_$Declaration_0_0 instance = new bagof_$Declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_Declaration_0_0");
    Fail22129:
    { 
      TermReference x_4313 = new TermReference();
      TermReference y_4313 = new TermReference();
      if(y_4313.value == null)
        y_4313.value = term;
      else
        if(y_4313.value != term && !y_4313.value.match(term))
          break Fail22129;
      if(x_4313.value == null)
        x_4313.value = term;
      else
        if(x_4313.value != term && !x_4313.value.match(term))
          break Fail22129;
      Success11926:
      { 
        Fail22130:
        { 
          IStrategoTerm c_4314 = null;
          c_4314 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, c_4314, trans.const4360, y_4313.value);
          if(term == null)
            break Fail22130;
          if(true)
            break Success11926;
        }
        term = trans.constNil3;
      }
      lifted6775 lifted67750 = new lifted6775();
      lifted67750.x_4313 = x_4313;
      lifted67750.y_4313 = y_4313;
      term = filter_1_0.instance.invoke(context, term, lifted67750);
      if(term == null)
        break Fail22129;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}