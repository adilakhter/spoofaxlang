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

@SuppressWarnings("all") public class bagof_$Project$Dir_0_0 extends Strategy 
{ 
  public static bagof_$Project$Dir_0_0 instance = new bagof_$Project$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ProjectDir_0_0");
    Fail23397:
    { 
      TermReference s_4832 = new TermReference();
      if(s_4832.value == null)
        s_4832.value = term;
      else
        if(s_4832.value != term && !s_4832.value.match(term))
          break Fail23397;
      Success12579:
      { 
        Fail23398:
        { 
          IStrategoTerm v_4832 = null;
          IStrategoTerm x_4832 = null;
          IStrategoTerm y_4832 = null;
          x_4832 = term;
          v_4832 = trans.const4475;
          y_4832 = x_4832;
          term = dr_lookup_rule_0_2.instance.invoke(context, y_4832, v_4832, trans.constCons2047);
          if(term == null)
            break Fail23398;
          if(true)
            break Success12579;
        }
        term = trans.constNil4;
      }
      lifted6974 lifted69740 = new lifted6974();
      lifted69740.s_4832 = s_4832;
      term = filter_1_0.instance.invoke(context, term, lifted69740);
      if(term == null)
        break Fail23397;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}