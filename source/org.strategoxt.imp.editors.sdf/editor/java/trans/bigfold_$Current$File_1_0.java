package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class bigfold_$Current$File_1_0 extends Strategy 
{ 
  public static bigfold_$Current$File_1_0 instance = new bigfold_$Current$File_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_92077)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("bigfold_CurrentFile_1_0");
    Fail76121:
    { 
      IStrategoTerm t_92077 = null;
      IStrategoTerm v_92077 = null;
      v_92077 = term;
      Success41806:
      { 
        Fail76122:
        { 
          IStrategoTerm w_92077 = null;
          IStrategoTerm y_92077 = null;
          IStrategoTerm z_92077 = null;
          y_92077 = term;
          w_92077 = trans.const15448;
          z_92077 = y_92077;
          term = dr_lookup_all_rules_0_2.instance.invoke(context, z_92077, w_92077, trans.constCons7205);
          if(term == null)
            break Fail76122;
          if(true)
            break Success41806;
        }
        term = trans.constNil11;
      }
      t_92077 = term;
      term = v_92077;
      term = termFactory.makeTuple(t_92077, term);
      term = s_92077.invoke(context, term, lifted21587.instance);
      if(term == null)
        break Fail76121;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}