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

@SuppressWarnings("all") public class bigfold_$Memoize$Include$Properties_1_0 extends Strategy 
{ 
  public static bigfold_$Memoize$Include$Properties_1_0 instance = new bigfold_$Memoize$Include$Properties_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy c_4882)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_MemoizeIncludeProperties_1_0");
    Fail23694:
    { 
      IStrategoTerm z_4881 = null;
      IStrategoTerm d_4882 = null;
      IStrategoTerm f_4882 = null;
      z_4881 = term;
      f_4882 = term;
      Success12674:
      { 
        Fail23695:
        { 
          IStrategoTerm h_4882 = null;
          h_4882 = term;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, h_4882, trans.const4584, z_4881);
          if(term == null)
            break Fail23695;
          if(true)
            break Success12674;
        }
        term = trans.constNil4;
      }
      d_4882 = term;
      term = f_4882;
      term = termFactory.makeTuple(d_4882, term);
      term = c_4882.invoke(context, term, lifted7075.instance);
      if(term == null)
        break Fail23694;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}