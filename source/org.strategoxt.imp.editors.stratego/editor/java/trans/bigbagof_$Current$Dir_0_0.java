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

@SuppressWarnings("all") public class bigbagof_$Current$Dir_0_0 extends Strategy 
{ 
  public static bigbagof_$Current$Dir_0_0 instance = new bigbagof_$Current$Dir_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bigbagof_CurrentDir_0_0");
    Fail23574:
    { 
      TermReference l_4862 = new TermReference();
      if(l_4862.value == null)
        l_4862.value = term;
      else
        if(l_4862.value != term && !l_4862.value.match(term))
          break Fail23574;
      Success12626:
      { 
        Fail23575:
        { 
          IStrategoTerm o_4862 = null;
          IStrategoTerm q_4862 = null;
          IStrategoTerm r_4862 = null;
          q_4862 = term;
          o_4862 = trans.const4556;
          r_4862 = q_4862;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, r_4862, o_4862, trans.constCons2047);
          if(term == null)
            break Fail23575;
          if(true)
            break Success12626;
        }
        term = trans.constNil4;
      }
      lifted7034 lifted70340 = new lifted7034();
      lifted70340.l_4862 = l_4862;
      term = filter_1_0.instance.invoke(context, term, lifted70340);
      if(term == null)
        break Fail23574;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}