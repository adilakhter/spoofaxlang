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

@SuppressWarnings("all") public class bigfold_$Declaration_1_0 extends Strategy 
{ 
  public static bigfold_$Declaration_1_0 instance = new bigfold_$Declaration_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4865)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_Declaration_1_0");
    Fail23592:
    { 
      IStrategoTerm z_4864 = null;
      IStrategoTerm d_4865 = null;
      IStrategoTerm f_4865 = null;
      z_4864 = term;
      f_4865 = term;
      Success12629:
      { 
        Fail23593:
        { 
          IStrategoTerm h_4865 = null;
          h_4865 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4865, trans.const4570, z_4864);
          if(term == null)
            break Fail23593;
          if(true)
            break Success12629;
        }
        term = trans.constNil4;
      }
      d_4865 = term;
      term = f_4865;
      term = termFactory.makeTuple(d_4865, term);
      term = c_4865.invoke(context, term, lifted7039.instance);
      if(term == null)
        break Fail23592;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}