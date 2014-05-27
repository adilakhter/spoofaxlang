package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigbagof_get_config_reference_0_0 extends Strategy 
{ 
  public static bigbagof_get_config_reference_0_0 instance = new bigbagof_get_config_reference_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_get_config_reference_0_0");
    Fail22967:
    { 
      TermReference a_4636 = new TermReference();
      TermReference b_4636 = new TermReference();
      if(b_4636.value == null)
        b_4636.value = term;
      else
        if(b_4636.value != term && !b_4636.value.match(term))
          break Fail22967;
      if(a_4636.value == null)
        a_4636.value = term;
      else
        if(a_4636.value != term && !a_4636.value.match(term))
          break Fail22967;
      Success12214:
      { 
        Fail22968:
        { 
          IStrategoTerm e_4636 = null;
          IStrategoTerm g_4636 = null;
          IStrategoTerm h_4636 = null;
          g_4636 = term;
          e_4636 = trans.const4482;
          h_4636 = g_4636;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4636, e_4636, trans.constCons2047);
          if(term == null)
            break Fail22968;
          if(true)
            break Success12214;
        }
        term = trans.constNil4;
      }
      lifted6889 lifted68890 = new lifted6889();
      lifted68890.a_4636 = a_4636;
      lifted68890.b_4636 = b_4636;
      term = filter_1_0.instance.invoke(context, term, lifted68890);
      if(term == null)
        break Fail22967;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}