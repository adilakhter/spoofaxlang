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

@SuppressWarnings("all") public class bagof_$Content$Proposals_0_0 extends Strategy 
{ 
  public static bagof_$Content$Proposals_0_0 instance = new bagof_$Content$Proposals_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("bagof_ContentProposals_0_0");
    Fail22284:
    { 
      TermReference u_4339 = new TermReference();
      if(u_4339.value == null)
        u_4339.value = term;
      else
        if(u_4339.value != term && !u_4339.value.match(term))
          break Fail22284;
      Success11985:
      { 
        Fail22285:
        { 
          IStrategoTerm x_4339 = null;
          IStrategoTerm z_4339 = null;
          IStrategoTerm a_4340 = null;
          z_4339 = term;
          x_4339 = trans.const4401;
          a_4340 = z_4339;
          term = dr_lookup_rule_0_2.instance.invoke(context, a_4340, x_4339, trans.constCons1966);
          if(term == null)
            break Fail22285;
          if(true)
            break Success11985;
        }
        term = trans.constNil3;
      }
      lifted6830 lifted68300 = new lifted6830();
      lifted68300.u_4339 = u_4339;
      term = filter_1_0.instance.invoke(context, term, lifted68300);
      if(term == null)
        break Fail22284;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}