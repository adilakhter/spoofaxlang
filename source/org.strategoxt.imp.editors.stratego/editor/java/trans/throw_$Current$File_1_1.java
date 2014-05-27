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

@SuppressWarnings("all") public class throw_$Current$File_1_1 extends Strategy 
{ 
  public static throw_$Current$File_1_1 instance = new throw_$Current$File_1_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy w_4279, IStrategoTerm v_4279)
  { 
    context.push("throw_CurrentFile_1_1");
    Fail21927:
    { 
      IStrategoTerm y_4279 = null;
      y_4279 = term;
      term = dr_throw_1_2.instance.invoke(context, y_4279, w_4279, v_4279, trans.const4263);
      if(term == null)
        break Fail21927;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}