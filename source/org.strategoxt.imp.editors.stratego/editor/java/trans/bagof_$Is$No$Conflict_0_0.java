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

@SuppressWarnings("all") public class bagof_$Is$No$Conflict_0_0 extends Strategy 
{ 
  public static bagof_$Is$No$Conflict_0_0 instance = new bagof_$Is$No$Conflict_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_IsNoConflict_0_0");
    Fail22310:
    { 
      TermReference y_4343 = new TermReference();
      TermReference z_4343 = new TermReference();
      if(z_4343.value == null)
        z_4343.value = term;
      else
        if(z_4343.value != term && !z_4343.value.match(term))
          break Fail22310;
      if(y_4343.value == null)
        y_4343.value = term;
      else
        if(y_4343.value != term && !y_4343.value.match(term))
          break Fail22310;
      Success11992:
      { 
        Fail22311:
        { 
          IStrategoTerm d_4344 = null;
          d_4344 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, d_4344, trans.const4427, z_4343.value);
          if(term == null)
            break Fail22311;
          if(true)
            break Success11992;
        }
        term = trans.constNil3;
      }
      lifted6839 lifted68390 = new lifted6839();
      lifted68390.y_4343 = y_4343;
      lifted68390.z_4343 = z_4343;
      term = filter_1_0.instance.invoke(context, term, lifted68390);
      if(term == null)
        break Fail22310;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}