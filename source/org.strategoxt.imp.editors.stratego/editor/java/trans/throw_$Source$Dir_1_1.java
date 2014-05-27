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

@SuppressWarnings("all") public class throw_$Source$Dir_1_1 extends Strategy 
{ 
  public static throw_$Source$Dir_1_1 instance = new throw_$Source$Dir_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy g_4288, IStrategoTerm f_4288)
  { 
    context.push("throw_SourceDir_1_1");
    Fail21979:
    { 
      IStrategoTerm i_4288 = null;
      i_4288 = term;
      term = dr_throw_1_2.instance.invoke(context, i_4288, g_4288, f_4288, trans.const4342);
      if(term == null)
        break Fail21979;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}