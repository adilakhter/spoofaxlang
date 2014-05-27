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

@SuppressWarnings("all") public class fold_$Declaration_1_0 extends Strategy 
{ 
  public static fold_$Declaration_1_0 instance = new fold_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4865)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fold_Declaration_1_0");
    Fail23594:
    { 
      IStrategoTerm l_4865 = null;
      IStrategoTerm p_4865 = null;
      IStrategoTerm r_4865 = null;
      l_4865 = term;
      r_4865 = term;
      Success12630:
      { 
        Fail23595:
        { 
          IStrategoTerm t_4865 = null;
          t_4865 = term;
          term = dr_lookup_rule_0_2.instance.invoke(context, t_4865, trans.const4570, l_4865);
          if(term == null)
            break Fail23595;
          if(true)
            break Success12630;
        }
        term = trans.constNil4;
      }
      p_4865 = term;
      term = r_4865;
      term = termFactory.makeTuple(p_4865, term);
      term = o_4865.invoke(context, term, lifted7040.instance);
      if(term == null)
        break Fail23594;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}